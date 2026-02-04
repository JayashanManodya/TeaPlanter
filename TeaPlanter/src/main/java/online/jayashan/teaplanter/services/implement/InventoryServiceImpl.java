package online.jayashan.teaplanter.services.implement;

import lombok.AllArgsConstructor;
import online.jayashan.teaplanter.entities.Inventory;
import online.jayashan.teaplanter.services.InventoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    @Override
    public Inventory createNewItem(Inventory inventory) {
        return null;
    }

    @Override
    public List<Inventory> getAllItems(){
        return List.of();
    }

    @Override
    public Inventory getItemById(Integer id) {
        return null;
    }

    @Override
    public Inventory updateItemById(Integer id, Inventory updatedItem) {
        return null;
    }

    @Override
    public void deleteItem(Integer id) {

    }
}
