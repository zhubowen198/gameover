<?php
/**
 * Autogenerated by Thrift Compiler (0.9.2)-v1.0.1
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * THIS IS MODIFIED FOR ZAN GROUP, ANY PROBLEM PLS CONTACT Zan Group<zan@zanphp.io>
 * @generated
 */

namespace Com\Miaoju\Device\Entity;

use Kdt\Iron\Nova\Foundation\Protocol\TStruct;
use Thrift\Type\TType;


class MixDeviceStruct extends TStruct {
  /**
   * @var \Com\Miaoju\Device\Entity\DeviceStruct[]
   */
  public $deviceList = null;
  /**
   * @var int
   */
  public $total = null;

  protected $structSpec = [
    1 => [
      'var' => 'deviceList',
      'type' => TType::LST,
      'etype' => TType::STRUCT,
      'elem' => [
        'type' => TType::STRUCT,
        'class' => '\Com\Miaoju\Device\Entity\DeviceStruct',
        ],
      ],
    2 => [
      'var' => 'total',
      'type' => TType::I16,
      ],
    ];

}

