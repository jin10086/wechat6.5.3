package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class agb extends aqp {
    public String cTd;
    public int lZm;
    public int mFO;
    public int mFP;
    public float mjM;
    public float mjN;
    public int mrA;
    public String mrB;
    public String mrC;
    public int mrD;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            aVar.dV(2, this.lZm);
            aVar.j(3, this.mjM);
            aVar.j(4, this.mjN);
            aVar.dV(5, this.mrA);
            if (this.mrB != null) {
                aVar.e(6, this.mrB);
            }
            if (this.mrC != null) {
                aVar.e(7, this.mrC);
            }
            aVar.dV(8, this.mrD);
            if (this.cTd != null) {
                aVar.e(9, this.cTd);
            }
            aVar.dV(10, this.mFO);
            aVar.dV(11, this.mFP);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            r0 = (((r0 + a.a.a.a.dS(2, this.lZm)) + (a.a.a.b.b.a.cw(3) + 4)) + (a.a.a.b.b.a.cw(4) + 4)) + a.a.a.a.dS(5, this.mrA);
            if (this.mrB != null) {
                r0 += a.a.a.b.b.a.f(6, this.mrB);
            }
            if (this.mrC != null) {
                r0 += a.a.a.b.b.a.f(7, this.mrC);
            }
            r0 += a.a.a.a.dS(8, this.mrD);
            if (this.cTd != null) {
                r0 += a.a.a.b.b.a.f(9, this.cTd);
            }
            return (r0 + a.a.a.a.dS(10, this.mFO)) + a.a.a.a.dS(11, this.mFP);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            agb com_tencent_mm_protocal_c_agb = (agb) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_agb.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_agb.lZm = aVar3.pMj.mH();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_agb.mjM = aVar3.pMj.readFloat();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_agb.mjN = aVar3.pMj.readFloat();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_agb.mrA = aVar3.pMj.mH();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_agb.mrB = aVar3.pMj.readString();
                    return 0;
                case 7:
                    com_tencent_mm_protocal_c_agb.mrC = aVar3.pMj.readString();
                    return 0;
                case 8:
                    com_tencent_mm_protocal_c_agb.mrD = aVar3.pMj.mH();
                    return 0;
                case 9:
                    com_tencent_mm_protocal_c_agb.cTd = aVar3.pMj.readString();
                    return 0;
                case 10:
                    com_tencent_mm_protocal_c_agb.mFO = aVar3.pMj.mH();
                    return 0;
                case 11:
                    com_tencent_mm_protocal_c_agb.mFP = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
