package online.teaplanter.teaplanterbackend.service;

import online.teaplanter.teaplanterbackend.entity.InventoryItem;
import online.teaplanter.teaplanterbackend.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private InventoryRepository inventoryRepository;

    public List<InventoryItem> getAllItems(){
        return inventoryRepository.findAll();
    }

    public List<InventoryItem> getItemById(int id){
        return null;
    }

    public InventoryItem addItem(InventoryItem item){
        return inventoryRepository.save(item);
    }

    public InventoryItem updateItem(int id, InventoryItem item){
        return null;
    }

    public void  deleteItem(Long id){
        inventoryRepository.deleteById(id);
    }
}
