package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class ze extends aqp {
    public String gln;
    public String mAM;
    public String mAN;
    public int maG;
    public are mgD;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mgD == null) {
                throw new b("Not all required fields were included: RandomEncryKey");
            }
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.mAM != null) {
                aVar.e(2, this.mAM);
            }
            if (this.mAN != null) {
                aVar.e(3, this.mAN);
            }
            aVar.dV(4, this.maG);
            if (this.gln != null) {
                aVar.e(5, this.gln);
            }
            if (this.mgD == null) {
                return 0;
            }
            aVar.dX(6, this.mgD.aHr());
            this.mgD.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mAM != null) {
                r0 += a.a.a.b.b.a.f(2, this.mAM);
            }
            if (this.mAN != null) {
                r0 += a.a.a.b.b.a.f(3, this.mAN);
            }
            r0 += a.a.a.a.dS(4, this.maG);
            if (this.gln != null) {
                r0 += a.a.a.b.b.a.f(5, this.gln);
            }
            if (this.mgD != null) {
                r0 += a.a.a.a.dU(6, this.mgD.aHr());
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mgD != null) {
                return 0;
            }
            throw new b("Not all required fields were included: RandomEncryKey");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            ze zeVar = (ze) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            com.tencent.mm.ba.a enVar;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new en();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        zeVar.mPU = enVar;
                    }
                    return 0;
                case 2:
                    zeVar.mAM = aVar3.pMj.readString();
                    return 0;
                case 3:
                    zeVar.mAN = aVar3.pMj.readString();
                    return 0;
                case 4:
                    zeVar.maG = aVar3.pMj.mH();
                    return 0;
                case 5:
                    zeVar.gln = aVar3.pMj.readString();
                    return 0;
                case 6:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new are();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        zeVar.mgD = enVar;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
