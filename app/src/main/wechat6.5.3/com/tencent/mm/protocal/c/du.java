package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class du extends aqp {
    public long eeK;
    public int maG;
    public int meD;
    public LinkedList<li> meE = new LinkedList();
    public String meF;
    public String meG;
    public String meH;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            aVar.dV(2, this.meD);
            aVar.d(3, 8, this.meE);
            if (this.meF != null) {
                aVar.e(4, this.meF);
            }
            if (this.meG != null) {
                aVar.e(5, this.meG);
            }
            aVar.dV(6, this.maG);
            aVar.C(7, this.eeK);
            if (this.meH == null) {
                return 0;
            }
            aVar.e(8, this.meH);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            r0 = (r0 + a.a.a.a.dS(2, this.meD)) + a.a.a.a.c(3, 8, this.meE);
            if (this.meF != null) {
                r0 += a.a.a.b.b.a.f(4, this.meF);
            }
            if (this.meG != null) {
                r0 += a.a.a.b.b.a.f(5, this.meG);
            }
            r0 = (r0 + a.a.a.a.dS(6, this.maG)) + a.a.a.a.B(7, this.eeK);
            if (this.meH != null) {
                r0 += a.a.a.b.b.a.f(8, this.meH);
            }
            return r0;
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.meE.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            du duVar = (du) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            com.tencent.mm.ba.a enVar;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        enVar = new en();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        duVar.mPU = enVar;
                    }
                    return 0;
                case 2:
                    duVar.meD = aVar3.pMj.mH();
                    return 0;
                case 3:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        enVar = new li();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        duVar.meE.add(enVar);
                    }
                    return 0;
                case 4:
                    duVar.meF = aVar3.pMj.readString();
                    return 0;
                case 5:
                    duVar.meG = aVar3.pMj.readString();
                    return 0;
                case 6:
                    duVar.maG = aVar3.pMj.mH();
                    return 0;
                case 7:
                    duVar.eeK = aVar3.pMj.mI();
                    return 0;
                case 8:
                    duVar.meH = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
