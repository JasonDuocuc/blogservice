package com.huertohogar.blogservice;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/api/blog") // Esta es la "dirección" web de tu blog
public class BlogController {

    // Una lista en memoria para guardar los consejos
    private List<BlogTip> tips = new ArrayList<>();

    // Un generador de números para los IDs (1, 2, 3...)
    private AtomicInteger nextId = new AtomicInteger(1);

    public BlogController() {
        // Agregamos un par de consejos de prueba al iniciar
        tips.add(new BlogTip(nextId.getAndIncrement(), "Riega por la mañana", "Evita los hongos regando temprano."));
        tips.add(new BlogTip(nextId.getAndIncrement(), "Mide el pH", "El pH ideal para la mayoría es 6.5."));
    }

    //OBTENER TODOS LOS CONSEJOS
    @GetMapping
    public List<BlogTip> getAllTips() {
        return tips;
    }

    //CREAR UN CONSEJO NUEVO
    @PostMapping
    public BlogTip createTip(@RequestBody BlogTip nuevoTip) {
        nuevoTip.id = nextId.getAndIncrement(); // Le ponemos ID nuevo
        tips.add(nuevoTip); // Lo guardamos en la lista
        return nuevoTip;
    }

    // 3. EDITAR UN CONSEJO
    @PutMapping("/{id}")
    public BlogTip updateTip(@PathVariable int id, @RequestBody BlogTip tipEditado) {
        for (BlogTip t : tips) {
            if (t.id == id) {
                // Si encontramos el ID, actualizamos los datos
                t.titulo = tipEditado.titulo;
                t.contenido = tipEditado.contenido;
                return t;
            }
        }
        return null;
    }

    //BORRAR UN CONSEJO
    @DeleteMapping("/{id}")
    public boolean deleteTip(@PathVariable int id) {
        // Borra de la lista si el ID coincide
        return tips.removeIf(t -> t.id == id);
    }
}