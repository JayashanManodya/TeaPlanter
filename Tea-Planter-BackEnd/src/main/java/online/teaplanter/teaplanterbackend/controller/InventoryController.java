package online.teaplanter.teaplanterbackend.controller;

import lombok.RequiredArgsConstructor;
import online.teaplanter.teaplanterbackend.entity.InventoryItem;
import online.teaplanter.teaplanterbackend.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/items")
    public List<InventoryItem> getAllItems(){
        return inventoryService.getAllItems();
    }

    @GetMapping("/{id}")
    public List<InventoryItem> getItemById(@PathVariable int id){
        return inventoryService.getItemById(id);
    }

    @PostMapping("/items")
    public InventoryItem addItem(@RequestBody InventoryItem item){
        return inventoryService.addItem(item);
    }

    @PutMapping("/items/{id}")
    public InventoryItem updateItem(@PathVariable Integer id, @RequestBody InventoryItem item){
        return inventoryService.updateItem(id,item);
    }

    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable Long id){
        inventoryService.deleteItem(id);
    }




}
