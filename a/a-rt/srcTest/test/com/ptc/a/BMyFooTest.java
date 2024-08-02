package test.com.ptc.a;

import com.ptc.a.BMyFoo;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.test.BTestNg;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

@NiagaraType
@Test(groups = "ci")
public class BMyFooTest
        extends BTestNg {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $test.com.ptc.a.BMyFooTest(2979906276)1.0$ @*/
/* Generated Wed Jun 12 11:32:01 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BMyFooTest.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    // test 'foo'
    public void testFoo() {
        // given
        BMyFoo myFoo = new BMyFoo();

        // when
        myFoo.setFoo("wowzaa");

        // then
        Assert.assertEquals(myFoo.getFoo(), "wowzaa");
    }
}
