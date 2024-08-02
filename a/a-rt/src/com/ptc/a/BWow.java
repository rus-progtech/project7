package com.ptc.a;

import javax.baja.nre.annotations.*;
import javax.baja.sys.*;

@NiagaraType
@NiagaraProperty(
        name = "myFirstProperty",                   // REQUIRED
        type = "baja:RelTime",                      // REQUIRED
        defaultValue = "BRelTime.makeHours(1)",     // REQUIRED
        flags = Flags.HIDDEN | Flags.ASYNC,
        facets = {
                @Facet(name = "BFacets.MIN", value = "BRelTime.makeSeconds(0)"),
                @Facet(name = "BFacets.MAX", value = "BRelTime.makeSeconds(60)")
        }
)

@NiagaraAction(
        name = "myOnlyAction",                       // REQUIRED
        flags = Flags.HIDDEN,
        parameterType = "baja:RelTime",
        defaultValue = "BRelTime.makeSeconds(5)",
        returnType = "baja:RelTime",
        facets = {
                @Facet(name = "BFacets.MIN", value = "BRelTime.makeSeconds(0)"),
                @Facet(name = "BFacets.MAX", value = "BRelTime.makeSeconds(60)")
        }
)

@NiagaraTopic(
        name = "myFirstTopic",                      // REQUIRE
        flags = Flags.USER_DEFINED_1,
        eventType = "int",
        facets = {
                @Facet(name = "BFacets.MIN", value = "1"),
                @Facet(name = "BFacets.MAX", value = "40")
        }
)


public class BWow
        extends BComponent {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.a.BWow(571465297)1.0$ @*/
/* Generated Thu Jun 13 16:09:10 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "myFirstProperty"

  /**
   * Slot for the {@code myFirstProperty} property.
   * @see #getMyFirstProperty
   * @see #setMyFirstProperty
   */
  public static final Property myFirstProperty = newProperty(Flags.HIDDEN | Flags.ASYNC, BRelTime.makeHours(1), BFacets.make(BFacets.make(BFacets.MIN, BRelTime.makeSeconds(0)), BFacets.make(BFacets.MAX, BRelTime.makeSeconds(60))));

  /**
   * Get the {@code myFirstProperty} property.
   * @see #myFirstProperty
   */
  public BRelTime getMyFirstProperty() { return (BRelTime)get(myFirstProperty); }

  /**
   * Set the {@code myFirstProperty} property.
   * @see #myFirstProperty
   */
  public void setMyFirstProperty(BRelTime v) { set(myFirstProperty, v, null); }

  //endregion Property "myFirstProperty"

  //region Action "myOnlyAction"

  /**
   * Slot for the {@code myOnlyAction} action.
   * @see #myOnlyAction(BRelTime parameter)
   */
  public static final Action myOnlyAction = newAction(Flags.HIDDEN, BRelTime.makeSeconds(5), BFacets.make(BFacets.make(BFacets.MIN, BRelTime.makeSeconds(0)), BFacets.make(BFacets.MAX, BRelTime.makeSeconds(60))));

  /**
   * Invoke the {@code myOnlyAction} action.
   * @see #myOnlyAction
   */
  public BRelTime myOnlyAction(BRelTime parameter) { return (BRelTime)invoke(myOnlyAction, parameter, null); }

  //endregion Action "myOnlyAction"

  //region Topic "myFirstTopic"

  /**
   * Slot for the {@code myFirstTopic} topic.
   * @see #fireMyFirstTopic
   */
  public static final Topic myFirstTopic = newTopic(Flags.USER_DEFINED_1, BFacets.make(BFacets.make(BFacets.MIN, 1), BFacets.make(BFacets.MAX, 40)));

  /**
   * Fire an event for the {@code myFirstTopic} topic.
   * @see #myFirstTopic
   */
  public void fireMyFirstTopic(int event) { fire(myFirstTopic, event, null); }

  //endregion Topic "myFirstTopic"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BWow.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
