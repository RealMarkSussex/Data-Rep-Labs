<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<head>
				<title>
						Courses
					</title>
			</head>
			<body>
				<xsl:apply-templates select="/Course_Catalog/Department" />
			</body>
		</html>
	</xsl:template>


	<xsl:template match="/Course_Catalog/Department">
		<h1>
			Title:
			<xsl:value-of select="Title" />
		</h1>
		<p>
			Prof Name:
			<xsl:apply-templates select="Chair" />
		</p>
	</xsl:template>

	<xsl:template match="Chair">
		<xsl:copy-of select="node()" />
	</xsl:template>
</xsl:stylesheet>
