package com.tencent.mm.plugin.game.d;

import com.tencent.mm.ba.a;
import java.util.LinkedList;

public final class w extends a {
    public String gkW;
    public LinkedList<bt> glw = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.gkW != null) {
                aVar.e(1, this.gkW);
            }
            aVar.d(2, 8, this.glw);
            return 0;
        } else if (i == 1) {
            if (this.gkW != null) {
                r0 = a.a.a.b.b.a.f(1, this.gkW) + 0;
            } else {
                r0 = 0;
            }
            return r0 + a.a.a.a.c(2, 8, this.glw);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.glw.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            w wVar = (w) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    wVar.gkW = aVar3.pMj.readString();
                    return 0;
                case 2:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        bt btVar = new bt();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (boolean z = true; z; z = btVar.a(aVar4, btVar, a.a(aVar4))) {
                        }
                        wVar.glw.add(btVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
