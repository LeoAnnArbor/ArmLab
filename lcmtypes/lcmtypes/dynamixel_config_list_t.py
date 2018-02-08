"""LCM type definitions
This file automatically generated by lcm.
DO NOT MODIFY BY HAND!!!!
"""

try:
    import cStringIO.StringIO as BytesIO
except ImportError:
    from io import BytesIO
import struct

import lcmtypes.dynamixel_config_t

class dynamixel_config_list_t(object):
    __slots__ = ["len", "configs"]

    def __init__(self):
        self.len = 0
        self.configs = []

    def encode(self):
        buf = BytesIO()
        buf.write(dynamixel_config_list_t._get_packed_fingerprint())
        self._encode_one(buf)
        return buf.getvalue()

    def _encode_one(self, buf):
        buf.write(struct.pack(">i", self.len))
        for i0 in range(self.len):
            assert self.configs[i0]._get_packed_fingerprint() == lcmtypes.dynamixel_config_t._get_packed_fingerprint()
            self.configs[i0]._encode_one(buf)

    def decode(data):
        if hasattr(data, 'read'):
            buf = data
        else:
            buf = BytesIO(data)
        if buf.read(8) != dynamixel_config_list_t._get_packed_fingerprint():
            raise ValueError("Decode error")
        return dynamixel_config_list_t._decode_one(buf)
    decode = staticmethod(decode)

    def _decode_one(buf):
        self = dynamixel_config_list_t()
        self.len = struct.unpack(">i", buf.read(4))[0]
        self.configs = []
        for i0 in range(self.len):
            self.configs.append(lcmtypes.dynamixel_config_t._decode_one(buf))
        return self
    _decode_one = staticmethod(_decode_one)

    _hash = None
    def _get_hash_recursive(parents):
        if dynamixel_config_list_t in parents: return 0
        newparents = parents + [dynamixel_config_list_t]
        tmphash = (0xf7de54a48e3094ea+ lcmtypes.dynamixel_config_t._get_hash_recursive(newparents)) & 0xffffffffffffffff
        tmphash  = (((tmphash<<1)&0xffffffffffffffff)  + (tmphash>>63)) & 0xffffffffffffffff
        return tmphash
    _get_hash_recursive = staticmethod(_get_hash_recursive)
    _packed_fingerprint = None

    def _get_packed_fingerprint():
        if dynamixel_config_list_t._packed_fingerprint is None:
            dynamixel_config_list_t._packed_fingerprint = struct.pack(">Q", dynamixel_config_list_t._get_hash_recursive([]))
        return dynamixel_config_list_t._packed_fingerprint
    _get_packed_fingerprint = staticmethod(_get_packed_fingerprint)

