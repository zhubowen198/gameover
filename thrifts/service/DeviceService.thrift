namespace nova com.miaoju.device.service
include '../entity/ErrorLevel.thrift'
include '../entity/DeviceStruct.thrift'
include '../entity/BaseStruct.thrift'
include '../exception/DeviceServiceException.thrift'
service DeviceService {
    void    throwException() throws (1:DeviceServiceException.DeviceServiceException e);
    map<string, BaseStruct.BaseStruct>   getdeviceid(1:DeviceStruct.DeviceStruct device_struct);
    map<string, BaseStruct.BaseStruct>    createdevice(1:DeviceStruct.DeviceStruct device_struct);
    map<string, BaseStruct.BaseStruct>    updatedevice(1:DeviceStruct.DeviceStruct device_struct);
}