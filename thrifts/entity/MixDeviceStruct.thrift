namespace nova com.miaoju.device.entity
include 'DeviceStruct.thrift'
struct MixDeviceStruct {
    1:optional list<DeviceStruct.DeviceStruct> deviceList,
    2:optional i16 total
}