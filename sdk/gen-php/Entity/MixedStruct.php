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


class MixedStruct extends TStruct {
  /**
   * @var string
   */
  public $propString = null;
  /**
   * @var \Com\Miaoju\Device\Entity\BaseStruct
   */
  public $baseStruct = null;
  /**
   * @var \Com\Miaoju\Device\Entity\BaseStruct[]
   */
  public $propList = null;
  /**
   * @var \Com\Miaoju\Device\Entity\BaseStruct[]
   */
  public $propSet = null;
  /**
   * @var array
   */
  public $propMap = null;

  protected $structSpec = [
    1 => [
      'var' => 'propString',
      'type' => TType::STRING,
      ],
    2 => [
      'var' => 'baseStruct',
      'type' => TType::STRUCT,
      'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
      ],
    3 => [
      'var' => 'propList',
      'type' => TType::LST,
      'etype' => TType::STRUCT,
      'elem' => [
        'type' => TType::STRUCT,
        'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
        ],
      ],
    4 => [
      'var' => 'propSet',
      'type' => TType::SET,
      'etype' => TType::STRUCT,
      'elem' => [
        'type' => TType::STRUCT,
        'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
        ],
      ],
    5 => [
      'var' => 'propMap',
      'type' => TType::MAP,
      'ktype' => TType::STRING,
      'vtype' => TType::STRUCT,
      'key' => [
        'type' => TType::STRING,
      ],
      'val' => [
        'type' => TType::STRUCT,
        'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
        ],
      ],
    ];

}

