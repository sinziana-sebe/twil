package utility;

public class CCoefficient implements ICoefficient
{
    private final Double alpha;
    Double m_beta;
    private final Double m_gamma;

    public CCoefficient(final Double alpha, Double p_beta, final Double p_gamma ){
        this.alpha = alpha;
        m_beta = p_beta;
        m_gamma = p_gamma;
    }

    @Override
    public Double alpha()
    {return alpha;
    }

    @Override
    public Double beta()
    { return m_beta; }

    @Override
    public Double gamma()
    {
        return m_gamma;
    }

    public void local()
    {
        final Double localVariable = 0.0;
    }
}
