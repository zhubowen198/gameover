namespace nova com.miaoju.device.service
include '../entity/ErrorLevel.thrift'
include '../entity/BaseStruct.thrift'
include '../entity/DeviceStruct.thrift'
include '../entity/MixDeviceStruct.thrift'
include '../exception/DeviceServiceException.thrift'
service DeviceService {
    void    throwException() throws (1:DeviceServiceException.DeviceServiceException e);
    string  getDeviceList();
    DeviceStruct.DeviceStruct  getDeviceBaseStruct();
    MixDeviceStruct.MixDeviceStruct    getDevicemapBaseStruct();
    list<BaseStruct.BaseStruct>    getDevicelistshow();
}