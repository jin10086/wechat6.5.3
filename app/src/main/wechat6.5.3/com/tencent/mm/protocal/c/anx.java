package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class anx extends aqp {
    public long mNQ;
    public arf mOg;
    public arf mOh;
    public arf mOi;
    public int mOj;
    public int mqS;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mOg == null) {
                throw new b("Not all required fields were included: ClientReport");
            } else if (this.mOh == null) {
                throw new b("Not all required fields were included: ChannelReport");
            } else if (this.mOi == null) {
                throw new b("Not all required fields were included: EngineReport");
            } else {
                if (this.mPU != null) {
                    aVar.dX(1, this.mPU.aHr());
                    this.mPU.a(aVar);
                }
                if (this.mOg != null) {
                    aVar.dX(2, this.mOg.aHr());
                    this.mOg.a(aVar);
                }
                if (this.mOh != null) {
                    aVar.dX(3, this.mOh.aHr());
                    this.mOh.a(aVar);
                }
                if (this.mOi != null) {
                    aVar.dX(4, this.mOi.aHr());
                    this.mOi.a(aVar);
                }
                aVar.dV(5, this.mqS);
                aVar.C(6, this.mNQ);
                aVar.dV(7, this.mOj);
                return 0;
            }
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mOg != null) {
                r0 += a.a.a.a.dU(2, this.mOg.aHr());
            }
            if (this.mOh != null) {
                r0 += a.a.a.a.dU(3, this.mOh.aHr());
            }
            if (this.mOi != null) {
                r0 += a.a.a.a.dU(4, this.mOi.aHr());
            }
            return ((r0 + a.a.a.a.dS(5, this.mqS)) + a.a.a.a.B(6, this.mNQ)) + a.a.a.a.dS(7, this.mOj);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mOg == null) {
                throw new b("Not all required fields were included: ClientReport");
            } else if (this.mOh == null) {
                throw new b("Not all required fields were included: ChannelReport");
            } else if (this.mOi != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: EngineReport");
            }
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            anx com_tencent_mm_protocal_c_anx = (anx) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            a.a.a.a.a aVar4;
            boolean z;
            arf com_tencent_mm_protocal_c_arf;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_anx.mPU = enVar;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        com_tencent_mm_protocal_c_arf = new arf();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_arf.a(aVar4, com_tencent_mm_protocal_c_arf, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_anx.mOg = com_tencent_mm_protocal_c_arf;
                    }
                    return 0;
                case 3:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        com_tencent_mm_protocal_c_arf = new arf();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_arf.a(aVar4, com_tencent_mm_protocal_c_arf, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_anx.mOh = com_tencent_mm_protocal_c_arf;
                    }
                    return 0;
                case 4:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        com_tencent_mm_protocal_c_arf = new arf();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_arf.a(aVar4, com_tencent_mm_protocal_c_arf, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_anx.mOi = com_tencent_mm_protocal_c_arf;
                    }
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_anx.mqS = aVar3.pMj.mH();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_anx.mNQ = aVar3.pMj.mI();
                    return 0;
                case 7:
                    com_tencent_mm_protocal_c_anx.mOj = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
