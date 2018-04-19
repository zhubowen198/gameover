<?php
/**
 * Autogenerated by Thrift Compiler (0.9.2)-v1.0.1
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * THIS IS MODIFIED FOR ZAN GROUP, ANY PROBLEM PLS CONTACT Zan Group<zan@zanphp.io>
 * @generated
 */

namespace Com\Miaoju\Device\Servicespecification;

use Kdt\Iron\Nova\Foundation\TSpecification;
use Thrift\Type\TType;


class DeviceService extends TSpecification {

  protected $serviceName = 'Com.Miaoju.Device.Service.DeviceService';

  protected $inputStructSpec = [
    'throwException' => [
    ],
    'getDeviceList' => [
    ],
    'getDeviceBaseStruct' => [
    ],
    'getDevicemapBaseStruct' => [
    ],
    'getDevicelistshow' => [
    ],
  ];
  protected $outputStructSpec = [

    'throwException' => [
      'type' => TType::VOID,
    ],
    'getDeviceList' => [
      'type' => TType::STRING,
    ],
    'getDeviceBaseStruct' => [
      'type' => TType::STRUCT,
      'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
    ],
    'getDevicemapBaseStruct' => [
      'type' => TType::STRUCT,
      'class' => '\Com\Miaoju\Device\Entity\MixDeviceStruct',
    ],
    'getDevicelistshow' => [
      'type' => TType::LST,
      'etype' => TType::STRUCT,
      'elem' => [
        'type' => TType::STRUCT,
        'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
        ],
    ],
  ];
  protected $exceptionStructSpec = [

    'throwException' => [
      1 => [
        'var' => 'e',
        'type' => TType::STRUCT,
        'class' => '\Com\Miaoju\Device\Exception\DeviceServiceException',
        ],
    ],
  ];
}

