package com.tencent.mm.plugin.game.d;

import a.a.a.b;
import com.tencent.mm.ba.a;
import java.util.LinkedList;

public final class ap extends a {
    public String aXz;
    public String gmD;
    public String gmE;
    public LinkedList<aq> gmL = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.aXz == null) {
                throw new b("Not all required fields were included: Title");
            }
            if (this.aXz != null) {
                aVar.e(1, this.aXz);
            }
            aVar.d(2, 8, this.gmL);
            if (this.gmD != null) {
                aVar.e(3, this.gmD);
            }
            if (this.gmE == null) {
                return 0;
            }
            aVar.e(4, this.gmE);
            return 0;
        } else if (i == 1) {
            if (this.aXz != null) {
                r0 = a.a.a.b.b.a.f(1, this.aXz) + 0;
            } else {
                r0 = 0;
            }
            r0 += a.a.a.a.c(2, 8, this.gmL);
            if (this.gmD != null) {
                r0 += a.a.a.b.b.a.f(3, this.gmD);
            }
            if (this.gmE != null) {
                r0 += a.a.a.b.b.a.f(4, this.gmE);
            }
            return r0;
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.gmL.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.aXz != null) {
                return 0;
            }
            throw new b("Not all required fields were included: Title");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            ap apVar = (ap) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    apVar.aXz = aVar3.pMj.readString();
                    return 0;
                case 2:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        aq aqVar = new aq();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (boolean z = true; z; z = aqVar.a(aVar4, aqVar, a.a(aVar4))) {
                        }
                        apVar.gmL.add(aqVar);
                    }
                    return 0;
                case 3:
                    apVar.gmD = aVar3.pMj.readString();
                    return 0;
                case 4:
                    apVar.gmE = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
