<?php
/**
 * Autogenerated by Thrift Compiler (0.9.2)-v1.0.1
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * THIS IS MODIFIED FOR ZAN GROUP, ANY PROBLEM PLS CONTACT Zan Group<zan@zanphp.io>
 * @generated
 */

namespace Com\Miaoju\Device\Service;

use Kdt\Iron\Nova\Foundation\TService;
use Thrift\Type\TType;


use Com\Miaoju\Device\Interfaces\DeviceService as DeviceServiceInterface;
use Com\Miaoju\Device\Servicespecification\DeviceService as DeviceServiceSpecification;

class DeviceService extends TService implements DeviceServiceInterface {

  protected function specificationProvider()
  {
    return new DeviceServiceSpecification();
  }

  /**
   * @throws \Com\Miaoju\Device\Exception\DeviceServiceException
   */
  public function throwException()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return string
   */
  public function getDeviceList()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return \Com\Miaoju\Device\Entity\BaseStruct
   */
  public function getDeviceBaseStruct()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return \Com\Miaoju\Device\Entity\MixDeviceStruct
   */
  public function getDevicemapBaseStruct()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return \Com\Miaoju\Device\Entity\BaseStruct[]
   */
  public function getDevicelistshow()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

}

