
package viejita;

enum EstadoMexicano {
    AGUASCALIENTES("Aguascalientes", Region.CENTRONORTE),
    BAJA_CALIFORNIA("Baja California", Region.NOROESTE),
    BAJA_CALIFORNIA_SUR("Baja California Sur ", Region.NOROESTE),
    CAMPECHE("Campeche", Region.SURESTE),
    CHIAPAS("Chiapas", Region.SUROESTE),
    CHIHUAHUA("Chihuaha", Region.NOROESTE),
    CIUDAD_DE_MEXICO("Ciudad de Mèxico", Region.CENTROSUR),
    COAHUILA("Coahuila", Region.NOROESTE),
    COLIMA("Colima", Region.OCCIDENTE),
    DURANGO("Durango", Region.NOROESTE),
    ESTADO_DE_MEXICO("Estado de Mèxico", Region.OCCIDENTE),
    GUANAJUATO("Guanajuato", Region.CENTRONORTE),
    GUERRERO("Guerrero", Region.CENTROSUR),
    HIDALGO("Hidalgo", Region.OCCIDENTE),
    JALISCO("Jalisco", Region.NOROESTE),
    MICHOACAN("Michoacàn", Region.OCCIDENTE),
    MORELOS("Morelos", Region.CENTROSUR),
    NAYARIT("Nayarit", Region.NOROESTE),
    NUEVO_LEON("Nuevo Leòn", Region.NOROESTE),
    OAXACA("Oaxaca", Region.SUROESTE),
    PUEBLA("Puebla", Region.ORIENTE),
    QUERETARO("Querètaro", Region.CENTRONORTE),
    QUINTANA_ROO("Quontana Roo", Region.SURESTE),
    SAN_LUIS_POTOSI("San Luis Potosì", Region.CENTRONORTE),
    SINALOA("Sinaloa", Region.NOROESTE),
    SONORA("Sonora", Region.NOROESTE),
    TABASCO("Tabasco", Region.SURESTE),
    TAMAULIPAS("Tamaulipas", Region.NOROESTE),
    TLAXCALA("Tlaxcala", Region.ORIENTE),
    VERACRUZ("Veracruz", Region.SURESTE),
    YUCATAN("Yucatàn", Region.SURESTE),
    ZACATECAS("Zacatecas", Region.CENTRONORTE);

    private final String nombreEstado;
    private final Region region;

    EstadoMexicano(String nombreEstado, Region region) {
        this.nombreEstado = nombreEstado;
        this.region = region;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public Region getRegion() {
        return region;
    }
}

enum Region {
    NOROESTE,
    NORTE,
    NORTHESTE,
    OCCIDENTE,
    CENTRONORTE,
    CENTROSUR,
    SURESTE,
    SUROESTE,
    ORIENTE
}