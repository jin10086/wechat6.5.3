package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class zk extends aqp {
    public String glC;
    public LinkedList<arf> glQ = new LinkedList();
    public int gmn;
    public int gmo;
    public int mAW;
    public int mAX;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            aVar.dV(2, this.mAW);
            aVar.dV(3, this.gmn);
            aVar.dV(4, this.gmo);
            if (this.glC != null) {
                aVar.e(5, this.glC);
            }
            aVar.dV(6, this.mAX);
            aVar.d(7, 8, this.glQ);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            r0 = ((r0 + a.a.a.a.dS(2, this.mAW)) + a.a.a.a.dS(3, this.gmn)) + a.a.a.a.dS(4, this.gmo);
            if (this.glC != null) {
                r0 += a.a.a.b.b.a.f(5, this.glC);
            }
            return (r0 + a.a.a.a.dS(6, this.mAX)) + a.a.a.a.c(7, 8, this.glQ);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.glQ.clear();
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
            zk zkVar = (zk) objArr[1];
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
                        zkVar.mPU = enVar;
                    }
                    return 0;
                case 2:
                    zkVar.mAW = aVar3.pMj.mH();
                    return 0;
                case 3:
                    zkVar.gmn = aVar3.pMj.mH();
                    return 0;
                case 4:
                    zkVar.gmo = aVar3.pMj.mH();
                    return 0;
                case 5:
                    zkVar.glC = aVar3.pMj.readString();
                    return 0;
                case 6:
                    zkVar.mAX = aVar3.pMj.mH();
                    return 0;
                case 7:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        enVar = new arf();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        zkVar.glQ.add(enVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
