package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class awm extends aqx {
    public String mIB;
    public awa mSF;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mQl == null) {
                throw new b("Not all required fields were included: BaseResponse");
            } else if (this.mSF == null) {
                throw new b("Not all required fields were included: SnsObject");
            } else {
                if (this.mQl != null) {
                    aVar.dX(1, this.mQl.aHr());
                    this.mQl.a(aVar);
                }
                if (this.mSF != null) {
                    aVar.dX(2, this.mSF.aHr());
                    this.mSF.a(aVar);
                }
                if (this.mIB == null) {
                    return 0;
                }
                aVar.e(3, this.mIB);
                return 0;
            }
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mSF != null) {
                r0 += a.a.a.a.dU(2, this.mSF.aHr());
            }
            if (this.mIB != null) {
                r0 += a.a.a.b.b.a.f(3, this.mIB);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqx.a(aVar2); r0 > 0; r0 = aqx.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mQl == null) {
                throw new b("Not all required fields were included: BaseResponse");
            } else if (this.mSF != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: SnsObject");
            }
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            awm com_tencent_mm_protocal_c_awm = (awm) objArr[1];
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
                        com_tencent_mm_protocal_c_awm.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        awa com_tencent_mm_protocal_c_awa = new awa();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_awa.a(aVar4, com_tencent_mm_protocal_c_awa, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_awm.mSF = com_tencent_mm_protocal_c_awa;
                    }
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_awm.mIB = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
