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


class DemoService extends TSpecification {

  protected $serviceName = 'Com.Miaoju.Device.Service.DemoService';

  protected $inputStructSpec = [
    'throwException' => [
    ],
    'returnVoid' => [
    ],
    'returnBool' => [
    ],
    'returnI32' => [
    ],
    'returnDouble' => [
    ],
    'returnString' => [
    ],
    'returnEnum' => [
    ],
    'returnBaseStruct' => [
    ],
    'returnMixedStruct' => [
    ],
    'returnList' => [
    ],
    'returnSet' => [
    ],
    'returnMap' => [
    ],
    'paraBaseNoReturn' => [
      1 => [
        'var' => 'paraString',
        'type' => TType::STRING,
        ],
      2 => [
        'var' => 'errorLevel',
        'type' => TType::I32,
        ],
    ],
    'paraMixedNoReturn' => [
      1 => [
        'var' => 'paraBool',
        'type' => TType::BOOL,
        ],
      2 => [
        'var' => 'paraI32',
        'type' => TType::I32,
        ],
      3 => [
        'var' => 'paraDouble',
        'type' => TType::DOUBLE,
        ],
      4 => [
        'var' => 'paraString',
        'type' => TType::STRING,
        ],
      5 => [
        'var' => 'baseStruct',
        'type' => TType::STRUCT,
        'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
        ],
      6 => [
        'var' => 'returnList',
        'type' => TType::LST,
        'etype' => TType::STRUCT,
        'elem' => [
          'type' => TType::STRUCT,
          'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
          ],
        ],
      7 => [
        'var' => 'returnSet',
        'type' => TType::SET,
        'etype' => TType::STRUCT,
        'elem' => [
          'type' => TType::STRUCT,
          'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
          ],
        ],
      8 => [
        'var' => 'returnMap',
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
      9 => [
        'var' => 'errorLevel',
        'type' => TType::I32,
        ],
    ],
    'complexMethod' => [
      1 => [
        'var' => 'paraBool',
        'type' => TType::BOOL,
        ],
      2 => [
        'var' => 'paraI32',
        'type' => TType::I32,
        ],
      3 => [
        'var' => 'paraDouble',
        'type' => TType::DOUBLE,
        ],
      4 => [
        'var' => 'paraString',
        'type' => TType::STRING,
        ],
      5 => [
        'var' => 'baseStruct',
        'type' => TType::STRUCT,
        'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
        ],
      6 => [
        'var' => 'returnList',
        'type' => TType::LST,
        'etype' => TType::STRUCT,
        'elem' => [
          'type' => TType::STRUCT,
          'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
          ],
        ],
      7 => [
        'var' => 'returnSet',
        'type' => TType::SET,
        'etype' => TType::STRUCT,
        'elem' => [
          'type' => TType::STRUCT,
          'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
          ],
        ],
      8 => [
        'var' => 'returnMap',
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
      9 => [
        'var' => 'errorLevel',
        'type' => TType::I32,
        ],
    ],
  ];
  protected $outputStructSpec = [

    'throwException' => [
      'type' => TType::VOID,
    ],
    'returnVoid' => [
      'type' => TType::VOID,
    ],
    'returnBool' => [
      'type' => TType::BOOL,
    ],
    'returnI32' => [
      'type' => TType::I32,
    ],
    'returnDouble' => [
      'type' => TType::DOUBLE,
    ],
    'returnString' => [
      'type' => TType::STRING,
    ],
    'returnEnum' => [
      'type' => TType::I32,
    ],
    'returnBaseStruct' => [
      'type' => TType::STRUCT,
      'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
    ],
    'returnMixedStruct' => [
      'type' => TType::STRUCT,
      'class' => '\Com\Miaoju\Device\Entity\MixedStruct',
    ],
    'returnList' => [
      'type' => TType::LST,
      'etype' => TType::STRUCT,
      'elem' => [
        'type' => TType::STRUCT,
        'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
        ],
    ],
    'returnSet' => [
      'type' => TType::SET,
      'etype' => TType::STRUCT,
      'elem' => [
        'type' => TType::STRUCT,
        'class' => '\Com\Miaoju\Device\Entity\BaseStruct',
        ],
    ],
    'returnMap' => [
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
    'paraBaseNoReturn' => [
      'type' => TType::VOID,
    ],
    'paraMixedNoReturn' => [
      'type' => TType::VOID,
    ],
    'complexMethod' => [
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
  protected $exceptionStructSpec = [

    'throwException' => [
      1 => [
        'var' => 'e',
        'type' => TType::STRUCT,
        'class' => '\Com\Miaoju\Device\Exception\DemoServiceException',
        ],
    ],
  ];
}

