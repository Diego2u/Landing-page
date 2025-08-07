package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    // Mostrar el formulario
    @GetMapping("/contact")
    public String showForm() {
        return "contact-form";  // Nombre del archivo HTML (sin .html)
    }

    // Procesar el formulario y guardar los datos
    @PostMapping("/contacts")
    public String submitForm(@ModelAttribute Contact contact) {
        // Guardar el contacto en la base de datos
        contactRepository.save(contact);
        return "contact-success";  // Redirigir a la página de éxito
    }
}