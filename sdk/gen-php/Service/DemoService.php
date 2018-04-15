<?php
/**
 * Autogenerated by Thrift Compiler (0.9.2)-v1.0.1
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * THIS IS MODIFIED FOR ZAN GROUP, ANY PROBLEM PLS CONTACT Zan Group<zan@zanphp.io>
 * @generated
 */

namespace Com\Yourcompany\Demo\Service;

use Kdt\Iron\Nova\Foundation\TService;
use Thrift\Type\TType;


use Com\Yourcompany\Demo\Interfaces\DemoService as DemoServiceInterface;
use Com\Yourcompany\Demo\Servicespecification\DemoService as DemoServiceSpecification;

class DemoService extends TService implements DemoServiceInterface {

  protected function specificationProvider()
  {
    return new DemoServiceSpecification();
  }

  /**
   * @throws \Com\Yourcompany\Demo\Exception\DemoServiceException
   */
  public function throwException()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   */
  public function returnVoid()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return bool
   */
  public function returnBool()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return int
   */
  public function returnI32()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return double
   */
  public function returnDouble()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return string
   */
  public function returnString()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return int
   */
  public function returnEnum()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return \Com\Yourcompany\Demo\Entity\BaseStruct
   */
  public function returnBaseStruct()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return \Com\Yourcompany\Demo\Entity\MixedStruct
   */
  public function returnMixedStruct()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return \Com\Yourcompany\Demo\Entity\BaseStruct[]
   */
  public function returnList()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return \Com\Yourcompany\Demo\Entity\BaseStruct[]
   */
  public function returnSet()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @return array
   */
  public function returnMap()
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @param string $paraString
   * @param int $errorLevel
   */
  public function paraBaseNoReturn($paraString, $errorLevel)
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @param bool $paraBool
   * @param int $paraI32
   * @param double $paraDouble
   * @param string $paraString
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct $baseStruct
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct[] $returnList
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct[] $returnSet
   * @param array $returnMap
   * @param int $errorLevel
   */
  public function paraMixedNoReturn($paraBool, $paraI32, $paraDouble, $paraString, \Com\Yourcompany\Demo\Entity\BaseStruct $baseStruct, array $returnList, array $returnSet, array $returnMap, $errorLevel)
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

  /**
   * @param bool $paraBool
   * @param int $paraI32
   * @param double $paraDouble
   * @param string $paraString
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct $baseStruct
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct[] $returnList
   * @param \Com\Yourcompany\Demo\Entity\BaseStruct[] $returnSet
   * @param array $returnMap
   * @param int $errorLevel
   * @return array
   */
  public function complexMethod($paraBool, $paraI32, $paraDouble, $paraString, \Com\Yourcompany\Demo\Entity\BaseStruct $baseStruct, array $returnList, array $returnSet, array $returnMap, $errorLevel)
  {
    return $this->apiCall(__FUNCTION__, func_get_args());
  }

}

