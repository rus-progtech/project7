package com.ptc.a;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraTopic;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BComponent;
import javax.baja.sys.Flags;
import javax.baja.sys.Action;
import javax.baja.sys.BString;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Topic;
import javax.baja.sys.Type;

@NiagaraType

@NiagaraProperty(
        name = "foo",
        type = "String",
        defaultValue = "sfafasf"
)

@NiagaraProperty(
        name = "bar",
        type = "BString",
        defaultValue = "BString.make(\"bar\")",
        flags = Flags.HIDDEN | Flags.TRANSIENT
)

@NiagaraAction(
        name = "things",
        returnType = "int"
)

@NiagaraTopic(
        name = "barChanged",
        eventType = "BString",
        flags = Flags.HIDDEN
)

public class BMultiAnnotationFoobar extends BComponent
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.a.BMultiAnnotationFoobar(1025313849)1.0$ @*/
/* Generated Thu Jun 13 16:04:38 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "foo"

  /**
   * Slot for the {@code foo} property.
   * @see #getFoo
   * @see #setFoo
   */
  public static final Property foo = newProperty(0, "sfafasf", null);

  /**
   * Get the {@code foo} property.
   * @see #foo
   */
  public String getFoo() { return getString(foo); }

  /**
   * Set the {@code foo} property.
   * @see #foo
   */
  public void setFoo(String v) { setString(foo, v, null); }

  //endregion Property "foo"

  //region Property "bar"

  /**
   * Slot for the {@code bar} property.
   * @see #getBar
   * @see #setBar
   */
  public static final Property bar = newProperty(Flags.HIDDEN | Flags.TRANSIENT, BString.make("bar"), null);

  /**
   * Get the {@code bar} property.
   * @see #bar
   */
  public String getBar() { return getString(bar); }

  /**
   * Set the {@code bar} property.
   * @see #bar
   */
  public void setBar(String v) { setString(bar, v, null); }

  //endregion Property "bar"

  //region Action "things"

  /**
   * Slot for the {@code things} action.
   * @see #things()
   */
  public static final Action things = newAction(0, null);

  /**
   * Invoke the {@code things} action.
   * @see #things
   */
  public int things() { return (int)invoke(things, null, null); }

  //endregion Action "things"

  //region Topic "barChanged"

  /**
   * Slot for the {@code barChanged} topic.
   * @see #fireBarChanged
   */
  public static final Topic barChanged = newTopic(Flags.HIDDEN, null);

  /**
   * Fire an event for the {@code barChanged} topic.
   * @see #barChanged
   */
  public void fireBarChanged(BString event) { fire(barChanged, event, null); }

  //endregion Topic "barChanged"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMultiAnnotationFoobar.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
