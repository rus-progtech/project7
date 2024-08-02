package com.ptc.a;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraTopic;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Flags;
import javax.baja.sys.Action;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Topic;
import javax.baja.sys.Type;

@NiagaraType

@NiagaraProperty(
        name = "overrideProp",
        type = "String",
        defaultValue = "Foo",
        flags = Flags.HIDDEN,
        override = true
)

@NiagaraTopic(
        name = "overrideTopic",
        override = true
)

@NiagaraAction(
        name = "overrideAction",
        flags = Flags.HIDDEN,
        override = true
)

public class BTestSlotOverride
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.a.BTestSlotOverride(1699214957)1.0$ @*/
/* Generated Thu Jun 13 16:04:38 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "overrideProp"

  /**
   * Slot for the {@code overrideProp} property.
   * @see #getOverrideProp
   * @see #setOverrideProp
   */
  public static final Property overrideProp = newProperty(Flags.HIDDEN, "Foo", null);

  //endregion Property "overrideProp"

  //region Action "overrideAction"

  /**
   * Slot for the {@code overrideAction} action.
   * @see #overrideAction()
   */
  public static final Action overrideAction = newAction(Flags.HIDDEN, null);

  //endregion Action "overrideAction"

  //region Topic "overrideTopic"

  /**
   * Slot for the {@code overrideTopic} topic.
   * @see #fireOverrideTopic
   */
  public static final Topic overrideTopic = newTopic(0, null);

  //endregion Topic "overrideTopic"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTestSlotOverride.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
