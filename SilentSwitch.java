package;

public final class SilentSwitch {

  private int PreviousSlot = -1;
  final int Slot = -1;
  
  Slot = GetItemSlot(); // Replace by your item finding function
  if (Slot == -1) return;
  
  PreviousSlot = mc.player.inventory.currentItem;
  if (PreviousSlot == slot) return;
  
  mc.playerController.windowClick(mc.player.inventoryContainer.windowId, Slot, mc.player.inventory.currentItem, ClickType.SWAP, mc.player);
  // Action (Crystal Placement)
  mc.playerController.windowClick(mc.player.inventoryContainer.windowId, PreviousSlot, mc.player.inventory.currentItem, ClickType.SWAP, mc.player);
  mc.playerController.updateController();
}
