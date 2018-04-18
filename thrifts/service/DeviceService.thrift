namespace nova com.miaoju.device.service
include '../entity/ErrorLevel.thrift'
include '../entity/DeviceStruct.thrift'
include '../entity/MixDeviceStruct.thrift'
include '../exception/DeviceServiceException.thrift'
service DeviceService {
    void    throwException() throws (1:DeviceServiceException.DeviceServiceException e);
    MixDeviceStruct.MixDeviceStruct    getDeviceList(1:DeviceStruct.DeviceStruct device_struct);
}