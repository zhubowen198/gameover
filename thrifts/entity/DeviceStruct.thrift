namespace nova com.Miaoju.device.entity

include 'ErrorLevel.thrift'

struct DeviceStruct {
    1:optional i32 id,
    2:optional string device,
    3:optional string device_name,
    4:optional string province
    5:optional string city
    6:optional string area
    7:optional string address
    8:optional i32 state
    9:optional i32 create_time
}