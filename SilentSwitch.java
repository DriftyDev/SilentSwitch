package;

public final class SilentSwitch {

  private int PreviousSlot = -1;
  final int Slot = -1;
  
  Slot = GetItemSlot(); // Replace by your item finding function
  if (Slot == -1) return;
  
  PreviousSlot = mc.player.inventory.currentItem;
  if (PreviousSlot == Slot) return;
  
  mc.player.connection.sendPacket(new CPacketHeldItemChange(Slot));
  // Action (Crystal Placement)
  mc.player.connection.sendPacket(new CPacketHeldItemChange(PreviousSlot));
  mc.playerController.updateController();
}
