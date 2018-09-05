package org.omg.CORBA;


/**
* org/omg/CORBA/OperationDescription.java .
* IGNORE Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlj/src/main/java/com/sun/tools/corba/ee/idl/ir.idl
* IGNORE Sunday, January 21, 2018 1:54:23 PM EST
*/

public final class OperationDescription implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public String id = null;
  public String defined_in = null;
  public String version = null;
  public org.omg.CORBA.TypeCode result = null;
  public org.omg.CORBA.OperationMode mode = null;
  public String contexts[] = null;
  public org.omg.CORBA.ParameterDescription parameters[] = null;
  public org.omg.CORBA.ExceptionDescription exceptions[] = null;

  public OperationDescription ()
  {
  } // ctor

  public OperationDescription (String _name, String _id, String _defined_in, String _version, org.omg.CORBA.TypeCode _result, org.omg.CORBA.OperationMode _mode, String[] _contexts, org.omg.CORBA.ParameterDescription[] _parameters, org.omg.CORBA.ExceptionDescription[] _exceptions)
  {
    name = _name;
    id = _id;
    defined_in = _defined_in;
    version = _version;
    result = _result;
    mode = _mode;
    contexts = _contexts;
    parameters = _parameters;
    exceptions = _exceptions;
  } // ctor

} // class OperationDescription