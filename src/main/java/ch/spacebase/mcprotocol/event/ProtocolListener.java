package ch.spacebase.mcprotocol.event;

public abstract class ProtocolListener {

	public abstract void onPacketRecieve(PacketRecieveEvent event);

}
