package online.jayashan.teaplanter.services;

import online.jayashan.teaplanter.entities.Inventory;
import java.util.List;

public interface InventoryService {

    Inventory createNewItem(Inventory inventory);

    List<Inventory> getAllItems();

    Inventory getItemById(Integer id);

    Inventory updateItemById(Integer id, Inventory updatedItem );

    void deleteItem(Integer id);
}
