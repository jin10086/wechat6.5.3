package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class bdh extends aqp {
    public int lZm;
    public arf mBN;
    public int mRN;
    public String mZj;
    public arf mZk;
    public are mfv;
    public String mgS;
    public arf mgW;
    public are mgX;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            aVar.dV(2, this.lZm);
            if (this.mZj != null) {
                aVar.e(3, this.mZj);
            }
            if (this.mgS != null) {
                aVar.e(4, this.mgS);
            }
            if (this.mBN != null) {
                aVar.dX(5, this.mBN.aHr());
                this.mBN.a(aVar);
            }
            if (this.mZk != null) {
                aVar.dX(6, this.mZk.aHr());
                this.mZk.a(aVar);
            }
            if (this.mgW != null) {
                aVar.dX(7, this.mgW.aHr());
                this.mgW.a(aVar);
            }
            if (this.mgX != null) {
                aVar.dX(8, this.mgX.aHr());
                this.mgX.a(aVar);
            }
            aVar.dV(9, this.mRN);
            if (this.mfv == null) {
                return 0;
            }
            aVar.dX(10, this.mfv.aHr());
            this.mfv.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            r0 += a.a.a.a.dS(2, this.lZm);
            if (this.mZj != null) {
                r0 += a.a.a.b.b.a.f(3, this.mZj);
            }
            if (this.mgS != null) {
                r0 += a.a.a.b.b.a.f(4, this.mgS);
            }
            if (this.mBN != null) {
                r0 += a.a.a.a.dU(5, this.mBN.aHr());
            }
            if (this.mZk != null) {
                r0 += a.a.a.a.dU(6, this.mZk.aHr());
            }
            if (this.mgW != null) {
                r0 += a.a.a.a.dU(7, this.mgW.aHr());
            }
            if (this.mgX != null) {
                r0 += a.a.a.a.dU(8, this.mgX.aHr());
            }
            r0 += a.a.a.a.dS(9, this.mRN);
            if (this.mfv != null) {
                r0 += a.a.a.a.dU(10, this.mfv.aHr());
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
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
            bdh com_tencent_mm_protocal_c_bdh = (bdh) objArr[1];
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
                        com_tencent_mm_protocal_c_bdh.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bdh.lZm = aVar3.pMj.mH();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_bdh.mZj = aVar3.pMj.readString();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_bdh.mgS = aVar3.pMj.readString();
                    return 0;
                case 5:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new arf();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bdh.mBN = enVar;
                    }
                    return 0;
                case 6:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new arf();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bdh.mZk = enVar;
                    }
                    return 0;
                case 7:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new arf();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bdh.mgW = enVar;
                    }
                    return 0;
                case 8:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new are();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bdh.mgX = enVar;
                    }
                    return 0;
                case 9:
                    com_tencent_mm_protocal_c_bdh.mRN = aVar3.pMj.mH();
                    return 0;
                case 10:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new are();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bdh.mfv = enVar;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
