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
use Kdt\Iron\Nova\Foundation\Protocol\TException;


class DeviceServiceException extends TException {
  /**
   * @var string
   */
  public $message = null;
  /**
   * @var int
   */
  public $code = null;

  protected $structSpec = [
    1 => [
      'var' => 'message',
      'type' => TType::STRING,
      ],
    2 => [
      'var' => 'code',
      'type' => TType::I32,
      ],
    ];

}

