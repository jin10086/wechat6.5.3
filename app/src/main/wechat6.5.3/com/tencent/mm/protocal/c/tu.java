package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class tu extends aqx {
    public int eet;
    public int efl;
    public int miR;
    public LinkedList<ajb> mwQ = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mQl == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.mQl != null) {
                aVar.dX(1, this.mQl.aHr());
                this.mQl.a(aVar);
            }
            aVar.dV(2, this.eet);
            aVar.d(5, 8, this.mwQ);
            aVar.dV(6, this.efl);
            aVar.dV(7, this.miR);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            return (((r0 + a.a.a.a.dS(2, this.eet)) + a.a.a.a.c(5, 8, this.mwQ)) + a.a.a.a.dS(6, this.efl)) + a.a.a.a.dS(7, this.miR);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.mwQ.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = aqx.a(aVar2); r0 > 0; r0 = aqx.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mQl != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            tu tuVar = (tu) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        eo eoVar = new eo();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = eoVar.a(aVar4, eoVar, aqx.a(aVar4))) {
                        }
                        tuVar.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    tuVar.eet = aVar3.pMj.mH();
                    return 0;
                case 5:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        ajb com_tencent_mm_protocal_c_ajb = new ajb();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_ajb.a(aVar4, com_tencent_mm_protocal_c_ajb, aqx.a(aVar4))) {
                        }
                        tuVar.mwQ.add(com_tencent_mm_protocal_c_ajb);
                    }
                    return 0;
                case 6:
                    tuVar.efl = aVar3.pMj.mH();
                    return 0;
                case 7:
                    tuVar.miR = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
