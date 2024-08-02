package com.ptc.a;

import javax.baja.nre.annotations.NiagaraSingleton;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BSingleton;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

@NiagaraType
@NiagaraSingleton

public class BSingletonTest extends BSingleton
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.a.BSingletonTest(2747097003)1.0$ @*/
/* Generated Thu Jun 13 16:04:38 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  public static final BSingletonTest INSTANCE = new BSingletonTest();

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BSingletonTest.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
