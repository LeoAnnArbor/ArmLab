/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package lcmtypes;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class dynamixel_config_list_t implements lcm.lcm.LCMEncodable
{
    public int len;
    public lcmtypes.dynamixel_config_t configs[];
 
    public dynamixel_config_list_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xf7de54a48e3094eaL;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(lcmtypes.dynamixel_config_list_t.class))
            return 0L;
 
        classes.add(lcmtypes.dynamixel_config_list_t.class);
        long hash = LCM_FINGERPRINT_BASE
             + lcmtypes.dynamixel_config_t._hashRecursive(classes)
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeInt(this.len); 
 
        for (int a = 0; a < this.len; a++) {
            this.configs[a]._encodeRecursive(outs); 
        }
 
    }
 
    public dynamixel_config_list_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public dynamixel_config_list_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static lcmtypes.dynamixel_config_list_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        lcmtypes.dynamixel_config_list_t o = new lcmtypes.dynamixel_config_list_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.len = ins.readInt();
 
        this.configs = new lcmtypes.dynamixel_config_t[(int) len];
        for (int a = 0; a < this.len; a++) {
            this.configs[a] = lcmtypes.dynamixel_config_t._decodeRecursiveFactory(ins);
        }
 
    }
 
    public lcmtypes.dynamixel_config_list_t copy()
    {
        lcmtypes.dynamixel_config_list_t outobj = new lcmtypes.dynamixel_config_list_t();
        outobj.len = this.len;
 
        outobj.configs = new lcmtypes.dynamixel_config_t[(int) len];
        for (int a = 0; a < this.len; a++) {
            outobj.configs[a] = this.configs[a].copy();
        }
 
        return outobj;
    }
 
}

