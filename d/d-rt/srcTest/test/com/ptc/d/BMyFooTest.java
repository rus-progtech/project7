package test.com.ptc.d;

import com.ptc.d.BMyFoo;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.test.BTestNg;

@NiagaraType
@Test(groups = "ci")

public class BMyFooTest
        extends BTestNg{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
    /*@ $test.com.ptc.c.BMyFooTest(2979906276)1.0$ @*/
    /* Generated Fri Jun 14 16:56:18 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

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
        myFoo.setFoo("foo");

        // then
        Assert.assertEquals(myFoo.getFoo(), "foo");
    }
}
