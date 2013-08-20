package openblocks.sync;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.nbt.NBTTagCompound;

public interface ISyncableObject {
	public boolean hasChanged();

	public void resetChangeStatus();

	public void setHasChanged();

	public void readFromStream(DataInputStream stream) throws IOException;

	public void writeToStream(DataOutputStream stream, boolean fullData)
			throws IOException;

	public void writeToNBT(NBTTagCompound tag, String name);

	public void readFromNBT(NBTTagCompound tag, String name);

}
