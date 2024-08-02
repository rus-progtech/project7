package com.ptc.d;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

@NiagaraType
@NiagaraProperty(
        name = "foo",
        type = "baja:String",
        defaultValue = "BString.make(\"bar\")"
)

public class BMyFoo
    extends BComponent {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.c.BMyFoo(695044968)1.0$ @*/
/* Generated Fri Jun 14 16:55:06 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "foo"

  /**
   * Slot for the {@code foo} property.
   * @see #getFoo
   * @see #setFoo
   */
  public static final Property foo = newProperty(0, BString.make("bar"), null);

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

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMyFoo.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
