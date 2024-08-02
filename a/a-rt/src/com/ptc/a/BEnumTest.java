package com.ptc.a;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

@NiagaraType
@NiagaraEnum(
        range = {
                @Range("deny"),
                @Range("sameorigin"),
                @Range("any"),
                @Range(value="none", ordinal=5)
        },
        defaultValue = "sameorigin"
)

public final class BEnumTest extends BFrozenEnum
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.a.BEnumTest(2070766487)1.0$ @*/
/* Generated Thu Jun 13 16:04:38 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  /** Ordinal value for deny. */
  public static final int DENY = 0;
  /** Ordinal value for sameorigin. */
  public static final int SAMEORIGIN = 1;
  /** Ordinal value for any. */
  public static final int ANY = 2;
  /** Ordinal value for none. */
  public static final int NONE = 5;

  /** BEnumTest constant for deny. */
  public static final BEnumTest deny = new BEnumTest(DENY);
  /** BEnumTest constant for sameorigin. */
  public static final BEnumTest sameorigin = new BEnumTest(SAMEORIGIN);
  /** BEnumTest constant for any. */
  public static final BEnumTest any = new BEnumTest(ANY);
  /** BEnumTest constant for none. */
  public static final BEnumTest none = new BEnumTest(NONE);

  /** Factory method with ordinal. */
  public static BEnumTest make(int ordinal)
  {
    return (BEnumTest)deny.getRange().get(ordinal, false);
  }

  /** Factory method with tag. */
  public static BEnumTest make(String tag)
  {
    return (BEnumTest)deny.getRange().get(tag);
  }

  /** Private constructor. */
  private BEnumTest(int ordinal)
  {
    super(ordinal);
  }

  public static final BEnumTest DEFAULT = sameorigin;

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BEnumTest.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
