package Lab_Tasks.Lab_8.Task_3;

import java.util.Objects;

public class InventoryItem implements Compare {
    private String name;
    private int uniqueItemID;
    
    public InventoryItem(String name, int uniqueItemID) {
        this.name = name;
        this.uniqueItemID = uniqueItemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniqueItemID() {
        return uniqueItemID;
    }

    public void setUniqueItemID(int uniqueItemID) {
        this.uniqueItemID = uniqueItemID;
    }

    @Override
    public boolean compareObject(Object obj) {
        if (this == obj) return true;
        if (Objects.isNull(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        InventoryItem other = (InventoryItem) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (uniqueItemID != other.uniqueItemID)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem [Name: " + name + ", Unique Item ID: " + uniqueItemID + "]";
    }
}
