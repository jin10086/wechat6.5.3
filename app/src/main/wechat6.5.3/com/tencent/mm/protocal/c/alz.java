package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class alz extends aqx {
    public int fvC;
    public String fvD;
    public ama mML;
    public alr mMM;

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
            aVar.dV(2, this.fvC);
            if (this.fvD != null) {
                aVar.e(3, this.fvD);
            }
            if (this.mML != null) {
                aVar.dX(4, this.mML.aHr());
                this.mML.a(aVar);
            }
            if (this.mMM == null) {
                return 0;
            }
            aVar.dX(5, this.mMM.aHr());
            this.mMM.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            r0 += a.a.a.a.dS(2, this.fvC);
            if (this.fvD != null) {
                r0 += a.a.a.b.b.a.f(3, this.fvD);
            }
            if (this.mML != null) {
                r0 += a.a.a.a.dU(4, this.mML.aHr());
            }
            if (this.mMM != null) {
                r0 += a.a.a.a.dU(5, this.mMM.aHr());
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
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
            alz com_tencent_mm_protocal_c_alz = (alz) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        eo eoVar = new eo();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = eoVar.a(aVar4, eoVar, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_alz.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_alz.fvC = aVar3.pMj.mH();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_alz.fvD = aVar3.pMj.readString();
                    return 0;
                case 4:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        ama com_tencent_mm_protocal_c_ama = new ama();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_ama.a(aVar4, com_tencent_mm_protocal_c_ama, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_alz.mML = com_tencent_mm_protocal_c_ama;
                    }
                    return 0;
                case 5:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        alr com_tencent_mm_protocal_c_alr = new alr();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_alr.a(aVar4, com_tencent_mm_protocal_c_alr, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_alz.mMM = com_tencent_mm_protocal_c_alr;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
