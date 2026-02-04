package online.jayashan.teaplanter.controllers.v1;


import lombok.RequiredArgsConstructor;
import online.jayashan.teaplanter.entities.Inventory;
import online.jayashan.teaplanter.services.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inventories")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @PostMapping
    public Inventory createNewItem(@RequestBody Inventory inventory) {
        return inventoryService.createNewItem(inventory);
    }

    @GetMapping
    public List<Inventory> getAllItems() {
        return inventoryService.getAllItems();
    }

    @GetMapping("/{id}")
    public Inventory getItemById(@PathVariable Integer id) {
        return inventoryService.getItemById(id);
    }

    @PutMapping("/{id}")
    public Inventory updateItemById(
            @PathVariable Integer id,
            @RequestBody Inventory updatedItem
    ) {
        return inventoryService.updateItemById(id, updatedItem);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Integer id) {
        inventoryService.deleteItem(id);
    }

}
