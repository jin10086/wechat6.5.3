package com.tencent.mm.protocal.c;

import a.a.a.b;
import com.tencent.mm.ba.a;
import java.util.LinkedList;

public final class apu extends a {
    public awp mPj;
    public arf mPk;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.mPj == null) {
                throw new b("Not all required fields were included: SnsRecommendObject");
            }
            if (this.mPj != null) {
                aVar.dX(1, this.mPj.aHr());
                this.mPj.a(aVar);
            }
            if (this.mPk == null) {
                return 0;
            }
            aVar.dX(2, this.mPk.aHr());
            this.mPk.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.mPj != null) {
                r0 = a.a.a.a.dU(1, this.mPj.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mPk != null) {
                r0 += a.a.a.a.dU(2, this.mPk.aHr());
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mPj != null) {
                return 0;
            }
            throw new b("Not all required fields were included: SnsRecommendObject");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            apu com_tencent_mm_protocal_c_apu = (apu) objArr[1];
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
                        awp com_tencent_mm_protocal_c_awp = new awp();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_awp.a(aVar4, com_tencent_mm_protocal_c_awp, a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_apu.mPj = com_tencent_mm_protocal_c_awp;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        arf com_tencent_mm_protocal_c_arf = new arf();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_arf.a(aVar4, com_tencent_mm_protocal_c_arf, a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_apu.mPk = com_tencent_mm_protocal_c_arf;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
