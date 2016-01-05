using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SystemRezerwacji
{
    class Prowiant
    {
        private int popcornDuzy;
        private int popcornMaly;
        private int colaDuza;
        private int colaMala;
        public Prowiant(int popcornDuzy, int popcornMaly, int colaDuza, int colaMala)
    {
        this.popcornDuzy = popcornDuzy;
        this.popcornMaly = popcornMaly;
        this.colaDuza = colaDuza;
        this.colaMala = colaMala;
    }
        public String toString()
        {
            String tmp = "";
            if(popcornDuzy > 0)
            {
                tmp += "popcorn duzy " + popcornDuzy + Environment.NewLine;
            }
            if (popcornMaly > 0)
            {
                tmp += "popcorn maly " + popcornMaly + Environment.NewLine;
            }
            if (colaDuza > 0)
            {
                tmp += "cola duza " + colaDuza + Environment.NewLine;
            }
            if (colaMala > 0)
            {
                tmp += "cola mala " + colaMala;
            }
            return tmp;
        }
    }
}
