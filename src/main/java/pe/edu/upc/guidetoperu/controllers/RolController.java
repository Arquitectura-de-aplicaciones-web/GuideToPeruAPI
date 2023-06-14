package pe.edu.upc.guidetoperu.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.guidetoperu.entities.Rol;
import pe.edu.upc.guidetoperu.services.IRolService;
import pe.edu.upc.guidetoperu.services.IUsuarioService;

@Controller
@SessionAttributes
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private IUsuarioService uService;
    @Autowired
    private IRolService rService;

    @GetMapping("/new")
    public String newRole(Model model) {
        model.addAttribute("rol", new Rol());
        model.addAttribute("listaUsuarios", uService.list());
        return "rol/rol";
    }

    @PostMapping("/save")
    public String saveRol(@Validated Rol rol, BindingResult result, Model model, SessionStatus status) throws Exception {
        if (result.hasErrors()) {
            return "rol/rol";
        } else {
            rService.insert(rol);
            model.addAttribute("mensaje", "Se guardó correctamente");
            status.setComplete();
        }
        model.addAttribute("listaRoles", rService.list());

        return "rol/rol";

    }

    @GetMapping("/list")
    public String listRol(Model model) {
        try {
            model.addAttribute("rol", new Rol());
            model.addAttribute("listaRoles", rService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "rol/listRol";
    }

}
