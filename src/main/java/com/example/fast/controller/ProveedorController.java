package com.example.fast.controller;

import com.example.fast.model.Proveedor;
import com.example.fast.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class ProveedorController {

        @Autowired
        private ProveedorService proveedorService;

        @GetMapping("/proveedor/all")
        public String getProveedores(Model model){
            List<Proveedor> proveedores = proveedorService.getProveedores();
            model.addAttribute("proveedores", proveedores);
            return "proveedor/all";
        }

        @GetMapping("/proveedor/new")
        public String showNewProveedor(Model model){
            model.addAttribute("proveedor", new Proveedor());
            return "proveedor/new";
        }

        @PostMapping("/proveedor/save")
        public String newProveedor(Proveedor proveedor){
            proveedorService.saveProveedor(proveedor);
            return "redirect:/proveedor/all";
        }

        @GetMapping("/proveedor/update/{id}")
        public String showUpdateProveedor(@PathVariable Long id, Model model){
            model.addAttribute("proveedor", proveedorService.getProveedor(id));
            return "proveedor/update";
        }

        @PostMapping("/proveedor/update/{id}")
        public String updateProveedor(@PathVariable Long id,Proveedor proveedor){
            proveedor.setId(id);
            proveedorService.updateProveedor(proveedor);
            return "redirect:/proveedor/all";
        }

        @GetMapping("/proveedor/delete/{id}")
        public String deleteProveedor(@PathVariable Long id){
            proveedorService.deleteProveedor(id);
            return "redirect:/proveedor/all";
        }
}
