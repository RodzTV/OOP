class ArithmeticProgression extends Progression {
  protected long increment;

  public ArithmeticProgression() {
      this(1);
  }

  public ArithmeticProgression(long increment) {
      this(increment, 0);
  }

  public ArithmeticProgression(long increment, long start) {
      super(start);
      this.increment = increment;
  }

  @Override
  protected void advance() {
      current += increment;
  }
}